package fb2;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f342378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list) {
        super(1);
        this.f342378d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        java.util.Iterator it = this.f342378d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (l17 != null && ((r45.yw2) it.next()).m75942xfb822ef2(3) == l17.longValue()) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
