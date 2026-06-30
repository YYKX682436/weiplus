package s23;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.m f483841d = new s23.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int h17 = s23.n.f483842d.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "updateAlbumUISelectLimit: newLimit:" + h17);
        if (h17 > 0) {
            java.util.Iterator it = s23.n.f483844f.iterator();
            while (it.hasNext()) {
                ((s23.o) it.next()).b(h17);
            }
        }
        return jz5.f0.f384359a;
    }
}
