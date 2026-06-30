package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class a implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f134349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f134350e;

    public a(java.util.Map.Entry entry, android.app.Application application) {
        this.f134349d = entry;
        this.f134350e = application;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        oj.j.a(d0Var.b(), "attached " + ((java.lang.String) this.f134349d.getKey()) + " turned OFF", new java.lang.Object[0]);
        java.lang.String str = d0Var.b() + '.' + ((java.lang.String) this.f134349d.getKey());
        try {
            d0Var.getClass();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j jVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f;
            if (jVar != null) {
                android.app.Application context = this.f134350e;
                java.lang.String statefulName = (java.lang.String) this.f134349d.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b17 = oj.m.b(context);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(context)");
                jVar.fg(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b17, statefulName, false));
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(str, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        oj.j.a(d0Var.b(), "attached " + ((java.lang.String) this.f134349d.getKey()) + " turned ON", new java.lang.Object[0]);
        java.lang.String str = d0Var.b() + '.' + ((java.lang.String) this.f134349d.getKey());
        try {
            d0Var.getClass();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j jVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f;
            if (jVar != null) {
                android.app.Application context = this.f134350e;
                java.lang.String statefulName = (java.lang.String) this.f134349d.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulName, "statefulName");
                int myPid = android.os.Process.myPid();
                java.lang.String b17 = oj.m.b(context);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixUtil.getProcessName(context)");
                jVar.fg(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b17, statefulName, true));
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(str, th6, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
    /* renamed from: serial */
    public boolean mo40995xca01fdf4() {
        return true;
    }
}
