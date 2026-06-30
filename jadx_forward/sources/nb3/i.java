package nb3;

/* loaded from: classes9.dex */
public class i implements nb3.a {

    /* renamed from: a, reason: collision with root package name */
    public nb3.b f417586a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f417587b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f417588c;

    /* renamed from: d, reason: collision with root package name */
    public int f417589d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f417590e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f417591f = new java.util.LinkedList();

    public static void a(nb3.i iVar, java.lang.String str, android.content.Intent intent) {
        nb3.b bVar = iVar.f417586a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "fail ui == null");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) bVar).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d activityC16324x5371571d = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) iVar.f417586a;
        activityC16324x5371571d.getClass();
        db5.e1.T(activityC16324x5371571d, str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d) iVar.f417586a).f226549m = intent;
    }

    public final void b(int i17) {
        new lb3.d(this.f417588c, this.f417587b, i17).a(new nb3.h(this, i17));
    }
}
