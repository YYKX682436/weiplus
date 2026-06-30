package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class jg extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl {

    /* renamed from: b, reason: collision with root package name */
    int f131515b;

    private jg(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar) {
        super(itVar);
    }

    private void a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = jhVarArr[0];
            this.f131550l.remove(java.lang.Integer.valueOf(jhVar.f131518a));
            this.f131550l.put(java.lang.Integer.valueOf(i17), jhVar);
        }
        this.f131515b = i17;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg e(long j17) {
        super.b(j17);
        return this;
    }

    private int o() {
        return this.f131515b;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it p() {
        return this.f131551m;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg q() {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg) super.mo36792x5a5dd5d();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw b(long j17) {
        super.b(j17);
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    /* renamed from: clone */
    public final /* synthetic */ java.lang.Object mo36792x5a5dd5d() {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg) super.mo36792x5a5dd5d();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw mo36792x5a5dd5d() {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg) super.mo36792x5a5dd5d();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    /* renamed from: toString */
    public final java.lang.String mo36797x9616526c() {
        java.lang.String str = "ObjectAnimator@" + java.lang.Integer.toHexString(hashCode()) + ", target " + this.f131551m;
        if (this.f131549k != null) {
            for (int i17 = 0; i17 < this.f131549k.length; i17++) {
                str = str + "\n    " + this.f131549k[i17].m36800x9616526c();
            }
        }
        return str;
    }

    private jg(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, int i17) {
        super(itVar);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = jhVarArr[0];
            this.f131550l.remove(java.lang.Integer.valueOf(jhVar.f131518a));
            this.f131550l.put(java.lang.Integer.valueOf(i17), jhVar);
        }
        this.f131515b = i17;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, int... iArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg jgVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg(itVar, 0);
        jgVar.a(iArr);
        return jgVar;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, int i17, double... dArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg jgVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg(itVar, i17);
        jgVar.a(dArr);
        return jgVar;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar, java.lang.Object[] objArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg jgVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg(itVar, 1);
        jgVar.a(objArr);
        jgVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<?>) jkVar);
        return jgVar;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh... jhVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg jgVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jg(itVar);
        jgVar.a(jhVarArr);
        return jgVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    public final void a(int... iArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(this.f131515b, iArr));
        } else {
            super.a(iArr);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    public final void a(double... dArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(this.f131515b, dArr));
        } else {
            super.a(dArr);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    public final void a(java.lang.Object... objArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh[] jhVarArr = this.f131549k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh.a(this.f131515b, objArr));
        } else {
            super.a(objArr);
        }
    }
}
