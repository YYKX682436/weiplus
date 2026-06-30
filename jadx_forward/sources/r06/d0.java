package r06;

/* loaded from: classes16.dex */
public class d0 extends y16.t {

    /* renamed from: b, reason: collision with root package name */
    public final e26.v f449911b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.v f449912c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f449913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r06.e0 f449914e;

    public d0(r06.e0 e0Var, e26.c0 c0Var) {
        if (c0Var == null) {
            h(0);
            throw null;
        }
        this.f449914e = e0Var;
        e26.u uVar = (e26.u) c0Var;
        this.f449911b = uVar.c(new r06.z(this, e0Var));
        this.f449912c = uVar.c(new r06.a0(this, e0Var));
        this.f449913d = uVar.b(new r06.b0(this, e0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r06.d0.h(int):void");
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        java.util.Set set = (java.util.Set) this.f449914e.f449929p.mo152xb9724478();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g gVar, w06.a aVar) {
        if (gVar == null) {
            h(5);
            throw null;
        }
        if (aVar == null) {
            h(6);
            throw null;
        }
        java.util.Collection collection = (java.util.Collection) ((e26.r) this.f449911b).mo146xb9724478(gVar);
        if (collection != null) {
            return collection;
        }
        h(7);
        throw null;
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g gVar, w06.a aVar) {
        if (gVar == null) {
            h(1);
            throw null;
        }
        if (aVar == null) {
            h(2);
            throw null;
        }
        java.util.Collection collection = (java.util.Collection) ((e26.r) this.f449912c).mo146xb9724478(gVar);
        if (collection != null) {
            return collection;
        }
        h(3);
        throw null;
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        h(18);
        throw null;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i iVar, yz5.l lVar) {
        if (iVar == null) {
            h(13);
            throw null;
        }
        if (lVar == null) {
            h(14);
            throw null;
        }
        java.util.Collection collection = (java.util.Collection) ((e26.o) this.f449913d).mo152xb9724478();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        java.util.Set set = (java.util.Set) this.f449914e.f449929p.mo152xb9724478();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final y16.s i() {
        y16.s V = ((f26.o0) ((f26.l) this.f449914e.g()).a().iterator().next()).V();
        if (V != null) {
            return V;
        }
        h(9);
        throw null;
    }

    public final java.util.Collection j(n16.g gVar, java.util.Collection collection) {
        if (gVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        r16.x.f450212d.h(gVar, collection, java.util.Collections.emptySet(), this.f449914e, new r06.c0(this, linkedHashSet));
        return linkedHashSet;
    }
}
