package zo1;

/* loaded from: classes5.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        super(0);
        this.f556313d = activityC12867x6b26c82f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556313d;
        java.lang.String[] stringArray = activityC12867x6b26c82f.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559551az);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(activityC12867x6b26c82f, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571069dx3, stringArray);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return arrayAdapter;
    }
}
