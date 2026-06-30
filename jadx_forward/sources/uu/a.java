package uu;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu.d f512727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uu.d dVar) {
        super(0);
        this.f512727d = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        java.text.SimpleDateFormat simpleDateFormat;
        java.lang.String str;
        java.lang.String str2;
        java.util.List list;
        uu.d dVar = this.f512727d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            s15.w wVar = dVar.f512735d;
            if (wVar != null) {
                s15.h hVar = (s15.h) kz5.n0.Z(wVar.j());
                if (hVar == null || (str = hVar.O()) == null) {
                    str = "";
                }
                s15.h hVar2 = (s15.h) kz5.n0.k0(wVar.j());
                if (hVar2 == null || (str2 = hVar2.O()) == null) {
                    str2 = "";
                }
                java.util.List g17 = new r26.t(" ").g(str, 0);
                boolean isEmpty = g17.isEmpty();
                java.util.List list2 = kz5.p0.f395529d;
                if (!isEmpty) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = list2;
                java.util.List g18 = new r26.t("-").g(((java.lang.String[]) list.toArray(new java.lang.String[0]))[0], 0);
                java.util.List g19 = new r26.t(" ").g(str2, 0);
                if (!g19.isEmpty()) {
                    java.util.ListIterator listIterator2 = g19.listIterator(g19.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                            list2 = kz5.n0.K0(g19, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                java.util.List g27 = new r26.t("-").g(((java.lang.String[]) list2.toArray(new java.lang.String[0]))[0], 0);
                simpleDateFormat = (g18.size() == 3 && g27.size() == 3 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g18.get(0), g27.get(0)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g18.get(1), g27.get(1)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g18.get(2), g27.get(2))) ? new java.text.SimpleDateFormat("") : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.X(g18), kz5.n0.X(g27)) ? new java.text.SimpleDateFormat(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2)) : new java.text.SimpleDateFormat(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fcl));
            } else {
                simpleDateFormat = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(simpleDateFormat);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return (java.text.SimpleDateFormat) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
    }
}
