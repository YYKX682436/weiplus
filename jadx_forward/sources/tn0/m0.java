package tn0;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un0.h f502256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(un0.h hVar, tn0.w0 w0Var) {
        super(0);
        this.f502256d = hVar;
        this.f502257e = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f502256d.f510889e;
        if (bitmap != null) {
            tn0.w0 w0Var = this.f502257e;
            w0Var.N0(bitmap, 1);
            w0Var.d0(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set cover when screen cast stop.");
        }
        return jz5.f0.f384359a;
    }
}
