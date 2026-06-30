package d33;

/* loaded from: classes9.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f307751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f307752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, android.content.Intent intent, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f307750d = activityC15646xc9a7ee3f;
        this.f307751e = intent;
        this.f307752f = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307750d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC15646xc9a7ee3f.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String str = activityC15646xc9a7ee3f.Y6() + ((java.lang.String) this.f307752f.f391656d);
        android.content.Intent intent = this.f307751e;
        intent.putExtra("CropImage_OutputPath", str);
        activityC15646xc9a7ee3f.setResult(-1, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "finish emoji crop");
        activityC15646xc9a7ee3f.finish();
        return jz5.f0.f384359a;
    }
}
