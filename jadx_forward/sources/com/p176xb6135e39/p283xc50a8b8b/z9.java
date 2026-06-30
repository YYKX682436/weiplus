package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class z9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f127338d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f127339e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f127340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.ba f127341g;

    public z9(com.p176xb6135e39.p283xc50a8b8b.ba baVar, com.p176xb6135e39.p283xc50a8b8b.u9 u9Var) {
        this.f127341g = baVar;
    }

    public final java.util.Iterator a() {
        if (this.f127340f == null) {
            this.f127340f = this.f127341g.f126465f.entrySet().iterator();
        }
        return this.f127340f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f127338d + 1;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f127341g;
        if (i17 >= baVar.f126464e.size()) {
            return !baVar.f126465f.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        this.f127339e = true;
        int i17 = this.f127338d + 1;
        this.f127338d = i17;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f127341g;
        return i17 < baVar.f126464e.size() ? (java.util.Map.Entry) baVar.f126464e.get(this.f127338d) : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f127339e) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f127339e = false;
        int i17 = com.p176xb6135e39.p283xc50a8b8b.ba.f126462m;
        com.p176xb6135e39.p283xc50a8b8b.ba baVar = this.f127341g;
        baVar.b();
        if (this.f127338d >= baVar.f126464e.size()) {
            a().remove();
            return;
        }
        int i18 = this.f127338d;
        this.f127338d = i18 - 1;
        baVar.i(i18);
    }
}
