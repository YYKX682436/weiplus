package bn2;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f104373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bn2.i iVar) {
        super(1);
        this.f104373d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        an2.a item = (an2.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        xm2.l lVar = this.f104373d.f104398h;
        int indexOf = lVar.f536755a.indexOf(item.f90374b);
        int i19 = -1;
        if (indexOf != -1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = lVar.f536763i.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.widget.beauty.controlpanels.FinderLiveBeautyFineTuningControlPanelWidget.LayoutManager<*>");
            xm2.f fVar = (xm2.f) layoutManager;
            if (fVar.f536750p != indexOf) {
                int i27 = fVar.f536747m;
                int m8020x7e414b06 = fVar.m8020x7e414b06();
                int i28 = -i27;
                int i29 = 0;
                int i37 = 0;
                boolean z17 = false;
                int i38 = -1;
                while (true) {
                    i17 = fVar.f536743f;
                    i18 = fVar.f536745h;
                    if (i29 >= m8020x7e414b06) {
                        break;
                    }
                    boolean z18 = fVar.f536741d.get(i29) == null;
                    if (z18) {
                        i37++;
                    }
                    if (i37 > indexOf) {
                        break;
                    }
                    if (z18) {
                        i17 = i18;
                    }
                    int i39 = (z18 || z17) ? 0 : i27;
                    if (i37 == indexOf) {
                        if (i19 < 0) {
                            i19 = i28 + i39;
                        }
                        i38 = i28 + i39 + i17;
                    }
                    i28 += i39 + i17;
                    i29++;
                    z17 = z18;
                }
                if (i19 >= 0) {
                    int i47 = i19 + i18;
                    int i48 = fVar.f536748n;
                    if (i38 < 0) {
                        i38 = i48;
                    }
                    int i49 = i38 - i47;
                    int m8037x755bd410 = i49 > fVar.m8037x755bd410() ? (i47 - i18) - (i17 / 2) : i47 - ((fVar.m8037x755bd410() - i49) / 2);
                    int i57 = fVar.f536746i;
                    int i58 = m8037x755bd410 + i57;
                    int m8037x755bd4102 = (i48 + (i57 * 2)) - fVar.m8037x755bd410();
                    if (i58 > m8037x755bd4102) {
                        i58 = m8037x755bd4102;
                    }
                    fVar.f536749o = i58 >= 0 ? i58 : 0;
                    fVar.f536751q = true;
                    fVar.m8087x46ac7299();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
