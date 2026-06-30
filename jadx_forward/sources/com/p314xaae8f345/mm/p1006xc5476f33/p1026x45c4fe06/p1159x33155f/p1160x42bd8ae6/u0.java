package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v0 f167465e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.v0 v0Var, java.lang.String str) {
        this.f167465e = v0Var;
        this.f167464d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f167465e.f167472a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop v8 tracing: ");
        java.lang.String str = this.f167464d;
        sb6.append(str);
        android.widget.Toast.makeText(context, sb6.toString(), 1).show();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.V8Tracing", "stop v8 tracing: " + str);
    }
}
