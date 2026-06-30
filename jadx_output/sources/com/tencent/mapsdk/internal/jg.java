package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class jg extends com.tencent.mapsdk.internal.jl {

    /* renamed from: b, reason: collision with root package name */
    int f49982b;

    private jg(com.tencent.mapsdk.internal.it itVar) {
        super(itVar);
    }

    private void a(int i17) {
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null) {
            com.tencent.mapsdk.internal.jh jhVar = jhVarArr[0];
            this.f50017l.remove(java.lang.Integer.valueOf(jhVar.f49985a));
            this.f50017l.put(java.lang.Integer.valueOf(i17), jhVar);
        }
        this.f49982b = i17;
    }

    private com.tencent.mapsdk.internal.jg e(long j17) {
        super.b(j17);
        return this;
    }

    private int o() {
        return this.f49982b;
    }

    private com.tencent.mapsdk.internal.it p() {
        return this.f50018m;
    }

    private com.tencent.mapsdk.internal.jg q() {
        return (com.tencent.mapsdk.internal.jg) super.clone();
    }

    @Override // com.tencent.mapsdk.internal.jl, com.tencent.mapsdk.internal.iw
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.iw b(long j17) {
        super.b(j17);
        return this;
    }

    @Override // com.tencent.mapsdk.internal.jl, com.tencent.mapsdk.internal.iw
    public final /* synthetic */ java.lang.Object clone() {
        return (com.tencent.mapsdk.internal.jg) super.clone();
    }

    @Override // com.tencent.mapsdk.internal.jl, com.tencent.mapsdk.internal.iw
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.iw clone() {
        return (com.tencent.mapsdk.internal.jg) super.clone();
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final java.lang.String toString() {
        java.lang.String str = "ObjectAnimator@" + java.lang.Integer.toHexString(hashCode()) + ", target " + this.f50018m;
        if (this.f50016k != null) {
            for (int i17 = 0; i17 < this.f50016k.length; i17++) {
                str = str + "\n    " + this.f50016k[i17].toString();
            }
        }
        return str;
    }

    private jg(com.tencent.mapsdk.internal.it itVar, int i17) {
        super(itVar);
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr != null) {
            com.tencent.mapsdk.internal.jh jhVar = jhVarArr[0];
            this.f50017l.remove(java.lang.Integer.valueOf(jhVar.f49985a));
            this.f50017l.put(java.lang.Integer.valueOf(i17), jhVar);
        }
        this.f49982b = i17;
    }

    public static com.tencent.mapsdk.internal.jg a(com.tencent.mapsdk.internal.it itVar, int... iArr) {
        com.tencent.mapsdk.internal.jg jgVar = new com.tencent.mapsdk.internal.jg(itVar, 0);
        jgVar.a(iArr);
        return jgVar;
    }

    public static com.tencent.mapsdk.internal.jg a(com.tencent.mapsdk.internal.it itVar, int i17, double... dArr) {
        com.tencent.mapsdk.internal.jg jgVar = new com.tencent.mapsdk.internal.jg(itVar, i17);
        jgVar.a(dArr);
        return jgVar;
    }

    public static com.tencent.mapsdk.internal.jg a(com.tencent.mapsdk.internal.it itVar, com.tencent.mapsdk.internal.jk jkVar, java.lang.Object[] objArr) {
        com.tencent.mapsdk.internal.jg jgVar = new com.tencent.mapsdk.internal.jg(itVar, 1);
        jgVar.a(objArr);
        jgVar.a((com.tencent.mapsdk.internal.jk<?>) jkVar);
        return jgVar;
    }

    private static com.tencent.mapsdk.internal.jg a(com.tencent.mapsdk.internal.it itVar, com.tencent.mapsdk.internal.jh... jhVarArr) {
        com.tencent.mapsdk.internal.jg jgVar = new com.tencent.mapsdk.internal.jg(itVar);
        jgVar.a(jhVarArr);
        return jgVar;
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final void a(int... iArr) {
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.tencent.mapsdk.internal.jh.a(this.f49982b, iArr));
        } else {
            super.a(iArr);
        }
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final void a(double... dArr) {
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.tencent.mapsdk.internal.jh.a(this.f49982b, dArr));
        } else {
            super.a(dArr);
        }
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final void a(java.lang.Object... objArr) {
        com.tencent.mapsdk.internal.jh[] jhVarArr = this.f50016k;
        if (jhVarArr == null || jhVarArr.length == 0) {
            a(com.tencent.mapsdk.internal.jh.a(this.f49982b, objArr));
        } else {
            super.a(objArr);
        }
    }
}
