package ir1;

/* loaded from: classes3.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e f375552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d04 f375553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e, r45.d04 d04Var) {
        super(0);
        this.f375552d = activityC12967xcacb933e;
        this.f375553e = d04Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e = this.f375552d;
        activityC12967xcacb933e.f175468g.remove(this.f375553e);
        java.util.ArrayList infoList = activityC12967xcacb933e.f175468g;
        activityC12967xcacb933e.W6();
        ir1.d dVar = activityC12967xcacb933e.f175467f;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        java.util.ArrayList arrayList = dVar.f375483e;
        arrayList.clear();
        arrayList.addAll(infoList);
        dVar.notifyDataSetChanged();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC12967xcacb933e.mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = activityC12967xcacb933e.mo55332x76847179().getText(com.p314xaae8f345.mm.R.C30867xcad56011.n4x);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
