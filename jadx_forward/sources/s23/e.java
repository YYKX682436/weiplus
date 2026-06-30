package s23;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.e f483834d = new s23.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        if (z65.c.a() && longValue != s23.n.f483858w) {
            java.lang.ref.WeakReference weakReference = s23.n.f483859x;
            if (weakReference == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            android.content.Context context = (android.content.Context) weakReference.get();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = "DEBUG:Maas EventType Update " + longValue;
            e4Var.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "onTipsEntranceEventTypeUpdate from " + s23.n.f483858w + " to " + longValue);
        s23.n.f483858w = longValue;
        return jz5.f0.f384359a;
    }
}
