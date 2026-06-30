package p53;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f433601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f433602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p53.u f433603f;

    public o(p53.u uVar, jz5.l lVar, int i17) {
        this.f433603f = uVar;
        this.f433601d = lVar;
        this.f433602e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        jz5.l lVar = this.f433601d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        p53.u uVar = this.f433603f;
        if (!booleanValue) {
            uVar.a(uVar.f433614m);
            uVar.f433608d.setVisibility(8);
            return;
        }
        uVar.f433609e.setVisibility(8);
        uVar.f433613i.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        uVar.f433608d.setVisibility(0);
        java.lang.String str = (java.lang.String) lVar.f384367e;
        uVar.f433608d.m82583xcde73672(this.f433602e);
        uVar.f433608d.m82581x764e93a7(str);
        uVar.f433608d.m82584xebcf33cb(3);
        uVar.f433608d.g();
    }
}
