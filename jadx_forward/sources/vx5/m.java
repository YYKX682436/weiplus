package vx5;

/* loaded from: classes13.dex */
public class m implements tx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y f522914a;

    public m() {
        by5.c4.c("PinusStorage", "PinusWebStorage, Default.");
    }

    @Override // tx5.e
    public void a() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y yVar = this.f522914a;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y yVar = this.f522914a;
        if (yVar != null) {
            yVar.b(str);
            return;
        }
        by5.c4.f("PinusStorage", "delete origin(" + str + ") result is " + vx5.k.f522907a.g(80006, new java.lang.Object[]{str}));
    }

    public m(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y yVar) {
        this.f522914a = yVar;
    }
}
