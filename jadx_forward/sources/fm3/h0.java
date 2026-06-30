package fm3;

/* loaded from: classes2.dex */
public abstract class h0 {
    public static final java.lang.String a(r45.ss4 ss4Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        java.util.LinkedList m75941xfb821914;
        if (ss4Var == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0)) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) == null || (m75941xfb821914 = m76971x25b90ced.m75941xfb821914(0)) == null) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            java.lang.String m75945x2fec8307 = ((r45.jf2) it.next()).m75945x2fec8307(3);
            arrayList.add(java.lang.Integer.valueOf(((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0) ^ 1));
        }
        return kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
