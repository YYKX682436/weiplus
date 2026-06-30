package pk2;

/* loaded from: classes3.dex */
public final class t extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437785h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437786i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f437787j;

    /* renamed from: k, reason: collision with root package name */
    public final int f437788k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(pk2.o9 helper, int i17, int i18, int i19) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437785h = i19;
        this.f437786i = "";
        this.f437787j = jz5.h.b(new pk2.s(helper));
        this.f437788k = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        jf2.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        jf2.u uVar = (jf2.u) ((jz5.n) this.f437787j).mo141623x754a37bb();
        if (uVar != null) {
            java.util.Iterator it = uVar.f380935q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = 0;
                    break;
                } else {
                    jVar = it.next();
                    if (((jf2.h) jVar).mo58036x368f3a() == this.f437785h) {
                        break;
                    }
                }
            }
            jf2.j jVar2 = jVar instanceof jf2.j ? jVar : null;
            if (jVar2 != null) {
                jVar2.e(0);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437786i;
    }

    @Override // qk2.f
    public boolean o() {
        java.lang.Object obj;
        jf2.u uVar = (jf2.u) ((jz5.n) this.f437787j).mo141623x754a37bb();
        if (uVar == null) {
            return false;
        }
        java.util.Iterator it = uVar.f380935q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.h) obj).mo58036x368f3a() == this.f437785h) {
                break;
            }
        }
        return obj != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        jf2.u uVar = (jf2.u) ((jz5.n) this.f437787j).mo141623x754a37bb();
        if (uVar != null) {
            java.util.Iterator it = uVar.f380935q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((jf2.h) obj).mo58036x368f3a() == this.f437785h) {
                        break;
                    }
                }
            }
            jf2.j jVar = obj instanceof jf2.j ? (jf2.j) obj : null;
            jz5.l d17 = jVar != null ? jVar.d() : null;
            if (d17 != null) {
                r(menu, this.f437788k, ((java.lang.Number) d17.f384367e).intValue(), ((java.lang.Number) d17.f384366d).intValue());
            }
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437788k;
    }
}
