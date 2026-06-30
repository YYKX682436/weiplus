package t21;

/* loaded from: classes4.dex */
public class m0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 f496367d;

    public m0(com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800) {
        this.f496367d = c11149x9c6f800;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        boolean z17;
        int i17 = com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800.N1;
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800 = this.f496367d;
        if (c11149x9c6f800.f271281q == null) {
            return false;
        }
        boolean mo61531xc00617a4 = c11149x9c6f800.mo61531xc00617a4();
        if (mo61531xc00617a4) {
            c11149x9c6f800.D();
        }
        try {
            int mo69307x9746038c = c11149x9c6f800.f271281q.mo69307x9746038c() / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c11149x9c6f800.f271271d, "onTimerExpired, updateUI, playSec is " + mo69307x9746038c);
            c11149x9c6f800.W(mo69307x9746038c);
            z17 = c11149x9c6f800.b0(mo69307x9746038c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c11149x9c6f800.f271272e, "%s online video timer check error [%s] ", c11149x9c6f800.N(), e17.toString());
            z17 = false;
        }
        java.lang.String str = c11149x9c6f800.f271272e;
        c11149x9c6f800.N();
        return c11149x9c6f800.P() ? z17 && mo61531xc00617a4 && c11149x9c6f800.A() : z17 && mo61531xc00617a4;
    }
}
