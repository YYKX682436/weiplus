package dk2;

/* loaded from: classes3.dex */
public final class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315284d;

    public m3(dk2.r4 r4Var, android.content.Context context, yz5.l lVar, java.lang.String str) {
        this.f315281a = r4Var;
        this.f315282b = context;
        this.f315283c = lVar;
        this.f315284d = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.List list = ((mm2.x4) this.f315281a.m(mm2.x4.class)).f411061f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-msgList>(...)");
            java.lang.String str = this.f315284d;
            java.util.Iterator it = list.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.zf) obj3).a(), str)) {
                    break;
                }
            }
            dk2.zf zfVar = (dk2.zf) obj3;
            if (zfVar == null || (m75945x2fec8307 = zfVar.k()) == null) {
                java.util.ArrayList arrayList = ((mm2.f5) this.f315281a.m(mm2.f5.class)).f410557f;
                java.lang.String str2 = this.f315284d;
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it6.next();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xn1) obj4).m75936x14adae67(0);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, str2)) {
                        break;
                    }
                }
                r45.xn1 xn1Var = (r45.xn1) obj4;
                m75945x2fec8307 = xn1Var != null ? xn1Var.m75945x2fec8307(6) : null;
            }
            if (m75945x2fec8307 == null) {
                java.util.List list2 = ((mm2.o4) this.f315281a.m(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
                java.lang.String str3 = this.f315284d;
                synchronized (list2) {
                    java.util.Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next).f390705c, str3)) {
                            obj2 = next;
                            break;
                        }
                    }
                }
                km2.q qVar = (km2.q) obj2;
                if (qVar != null) {
                    m75945x2fec8307 = qVar.f390706d;
                }
            }
            dk2.xa.f315877a.a(this.f315281a.f315540b, 2, m75945x2fec8307);
            android.content.Context context = this.f315282b;
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eac));
            this.f315283c.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
