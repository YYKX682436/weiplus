package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d f134353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d) {
        super(2);
        this.f134353d = serviceC4692xa1b1260d;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String stateName = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        if (this.f134353d.f134345e.a()) {
            oj.j.c("Matrix.ProcessSupervisor.Service", "observe: no other process registered, ignore state changes", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f.c();
            android.content.Context applicationContext = this.f134353d.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "applicationContext");
            int myPid = android.os.Process.myPid();
            java.lang.String b17 = oj.m.b(applicationContext);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(context)");
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b17, "", false);
            boolean z17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i;
            c17.a(c4689x7ffeacea, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134340n, stateName, booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
