package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

/* loaded from: classes9.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.s0 f134323d = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.s0();

    public s0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.util.Collection statefuls = (java.util.Collection) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefuls, "statefuls");
        java.util.Collection collection = statefuls;
        if (!collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l) it.next()).mo40960xab2f7f06()) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
