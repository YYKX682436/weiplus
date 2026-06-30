package dk2;

/* loaded from: classes3.dex */
public final class n3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315329d;

    public n3(dk2.r4 r4Var, android.content.Context context, yz5.l lVar, java.lang.String str) {
        this.f315326a = r4Var;
        this.f315327b = context;
        this.f315328c = lVar;
        this.f315329d = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.Object obj4 = null;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.List list = ((mm2.x4) this.f315326a.m(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            java.lang.String str = this.f315329d;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.zf) obj2).a(), str)) {
                    break;
                }
            }
            dk2.zf zfVar = (dk2.zf) obj2;
            if (zfVar == null || (m75945x2fec8307 = zfVar.k()) == null) {
                java.util.ArrayList arrayList = ((mm2.f5) this.f315326a.m(mm2.f5.class)).f410557f;
                java.lang.String str2 = this.f315329d;
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xn1) obj3).m75936x14adae67(0);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, str2)) {
                        break;
                    }
                }
                r45.xn1 xn1Var = (r45.xn1) obj3;
                m75945x2fec8307 = xn1Var != null ? xn1Var.m75945x2fec8307(6) : null;
            }
            if (m75945x2fec8307 == null) {
                java.util.List list2 = ((mm2.o4) this.f315326a.m(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
                java.lang.String str3 = this.f315329d;
                synchronized (list2) {
                    java.util.Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390705c, str3)) {
                            obj4 = next;
                            break;
                        }
                    }
                }
                km2.q qVar = (km2.q) obj4;
                if (qVar != null) {
                    m75945x2fec8307 = qVar.f390706d;
                }
            }
            dk2.xa.f315877a.a(this.f315326a.f315540b, 1, m75945x2fec8307);
            android.content.Context context = this.f315327b;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaa));
            this.f315328c.mo146xb9724478(java.lang.Boolean.TRUE);
        } else if (fVar.f152149b == -200197) {
            android.content.Context context2 = this.f315327b;
            android.content.res.Resources resources = context2.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.ge1 ge1Var = new r45.ge1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.e12) fVar.f152151d).m75934xbce7f2f(1);
            ge1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            objArr[0] = java.lang.Integer.valueOf(ge1Var.m75939xb282bd08(0));
            db5.t7.g(context2, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eab, objArr));
        }
        return jz5.f0.f384359a;
    }
}
