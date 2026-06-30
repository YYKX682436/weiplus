package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc f131093a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] f131094b;

    /* renamed from: c, reason: collision with root package name */
    public float f131095c;

    public gb(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr, float f17) {
        this.f131093a = gcVar;
        this.f131094b = gcVarArr;
        this.f131095c = f17;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b() {
        return this.f131093a;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] c() {
        return this.f131094b;
    }

    private float d() {
        return this.f131095c;
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr, float f17) {
        this.f131093a = gcVar;
        this.f131094b = gcVarArr;
        this.f131095c = f17;
    }

    public final boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb gbVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar;
        if (gbVar == null || java.lang.Float.compare(gbVar.f131095c, this.f131095c) > 0) {
            return true;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar2 = this.f131093a;
        if (gcVar2 != null && (gcVar = gbVar.f131093a) != null && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(gcVar2, gcVar) > 50.0d) {
            return true;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr2 = this.f131094b;
        if (gcVarArr2 != null && (gcVarArr = gbVar.f131094b) != null && gcVarArr2.length == gcVarArr.length) {
            int i17 = 0;
            while (true) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] gcVarArr3 = this.f131094b;
                if (i17 >= gcVarArr3.length) {
                    break;
                }
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(gcVarArr3[i17], gbVar.f131094b[i17]) > 50.0d) {
                    return true;
                }
                i17++;
            }
        }
        return false;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb m36742x5a5dd5d() {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gb(this.f131093a, this.f131094b, this.f131095c);
    }
}
