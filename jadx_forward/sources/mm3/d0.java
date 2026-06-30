package mm3;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 f411149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f411150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 activityC16658x38bdd532, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(0);
        this.f411149d = activityC16658x38bdd532;
        this.f411150e = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.ef2 m76971x25b90ced2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 activityC16658x38bdd532 = this.f411149d;
        r45.ss4 ss4Var = activityC16658x38bdd532.f232427e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
        java.util.LinkedList<r45.jf2> m75941xfb8219142 = (c19792x256d2725 == null || (m76802x2dd016662 = c19792x256d2725.m76802x2dd01666()) == null || (m76971x25b90ced2 = m76802x2dd016662.m76971x25b90ced()) == null) ? null : m76971x25b90ced2.m75941xfb821914(5);
        if (m75941xfb8219142 == null || m75941xfb8219142.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicMvFreeMakerPreviewUI", "null or empty track list: " + m75941xfb8219142);
            activityC16658x38bdd532.finish();
        } else {
            for (r45.jf2 jf2Var : m75941xfb8219142) {
                java.util.LinkedList m75941xfb8219143 = ss4Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getRefObjectList(...)");
                java.util.Iterator it = m75941xfb8219143.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                    if (jf2Var.m75942xfb822ef2(2) != 0 ? jf2Var.m75942xfb822ef2(2) == c19792x256d27252.m76784x5db1b11() : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jf2Var.m75945x2fec8307(3), c19792x256d27252.m76803x6c285d75())) {
                        break;
                    }
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                r45.jf2 jf2Var2 = (c19792x256d27253 == null || (m76802x2dd01666 = c19792x256d27253.m76802x2dd01666()) == null || (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) == null || (m75941xfb821914 = m76971x25b90ced.m75941xfb821914(5)) == null) ? null : (r45.jf2) kz5.n0.Z(m75941xfb821914);
                if (jf2Var2 != null) {
                    jf2Var2.set(0, java.lang.Long.valueOf(jf2Var.m75942xfb822ef2(0)));
                    jf2Var2.set(1, java.lang.Integer.valueOf(jf2Var.m75939xb282bd08(1)));
                    jf2Var2.set(4, java.lang.Long.valueOf(jf2Var.m75942xfb822ef2(4)));
                    jf2Var2.set(10, jf2Var.m75945x2fec8307(10));
                }
            }
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                if (((r45.jf2) it6.next()).m75939xb282bd08(1) <= 0) {
                    it6.remove();
                }
            }
        }
        mm3.c0 c0Var = new mm3.c0(this.f411150e, activityC16658x38bdd532);
        r45.ss4 ss4Var2 = activityC16658x38bdd532.f232427e;
        java.lang.String m75945x2fec8307 = ss4Var2.m75945x2fec8307(2);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            fm3.u.A.c(ss4Var2, c0Var);
        } else {
            c0Var.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
