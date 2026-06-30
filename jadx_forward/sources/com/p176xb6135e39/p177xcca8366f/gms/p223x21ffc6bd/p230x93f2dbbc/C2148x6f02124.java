package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzabe */
/* loaded from: classes13.dex */
final class C2148x6f02124 implements java.util.Iterator {
    private int pos;

    /* renamed from: zzbuf */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 f6304x6f02733;

    /* renamed from: zzbug */
    private boolean f6305x6f02734;

    /* renamed from: zzbuh */
    private java.util.Iterator f6306x6f02735;

    private C2148x6f02124(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119) {
        this.f6304x6f02733 = c2142x6f02119;
        this.pos = -1;
    }

    /* renamed from: zzup */
    private final java.util.Iterator m18877x394ddb() {
        java.util.Map map;
        if (this.f6306x6f02735 == null) {
            map = this.f6304x6f02733.f6296x6f02728;
            this.f6306x6f02735 = map.entrySet().iterator();
        }
        return this.f6306x6f02735;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        java.util.Map map;
        int i17 = this.pos + 1;
        list = this.f6304x6f02733.f6295x6f02727;
        if (i17 >= list.size()) {
            map = this.f6304x6f02733.f6296x6f02728;
            if (map.isEmpty() || !m18877x394ddb().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.List list;
        java.lang.Object next;
        java.util.List list2;
        this.f6305x6f02734 = true;
        int i17 = this.pos + 1;
        this.pos = i17;
        list = this.f6304x6f02733.f6295x6f02727;
        if (i17 < list.size()) {
            list2 = this.f6304x6f02733.f6295x6f02727;
            next = list2.get(this.pos);
        } else {
            next = m18877x394ddb().next();
        }
        return (java.util.Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.List list;
        if (!this.f6305x6f02734) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f6305x6f02734 = false;
        this.f6304x6f02733.m18865x394dd7();
        int i17 = this.pos;
        list = this.f6304x6f02733.f6295x6f02727;
        if (i17 >= list.size()) {
            m18877x394ddb().remove();
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119 = this.f6304x6f02733;
        int i18 = this.pos;
        this.pos = i18 - 1;
        c2142x6f02119.m18864x394b68(i18);
    }

    public /* synthetic */ C2148x6f02124(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2142x6f02119 c2142x6f02119, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2143x6f0211a c2143x6f0211a) {
        this(c2142x6f02119);
    }
}
