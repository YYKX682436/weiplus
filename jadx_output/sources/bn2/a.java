package bn2;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn2.i f22840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bn2.i iVar) {
        super(1);
        this.f22840d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        an2.a item = (an2.a) obj;
        kotlin.jvm.internal.o.g(item, "item");
        xm2.l lVar = this.f22840d.f22865h;
        int indexOf = lVar.f455222a.indexOf(item.f8841b);
        int i19 = -1;
        if (indexOf != -1) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = lVar.f455230i.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.widget.beauty.controlpanels.FinderLiveBeautyFineTuningControlPanelWidget.LayoutManager<*>");
            xm2.f fVar = (xm2.f) layoutManager;
            if (fVar.f455217p != indexOf) {
                int i27 = fVar.f455214m;
                int itemCount = fVar.getItemCount();
                int i28 = -i27;
                int i29 = 0;
                int i37 = 0;
                boolean z17 = false;
                int i38 = -1;
                while (true) {
                    i17 = fVar.f455210f;
                    i18 = fVar.f455212h;
                    if (i29 >= itemCount) {
                        break;
                    }
                    boolean z18 = fVar.f455208d.get(i29) == null;
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
                    int i48 = fVar.f455215n;
                    if (i38 < 0) {
                        i38 = i48;
                    }
                    int i49 = i38 - i47;
                    int width = i49 > fVar.getWidth() ? (i47 - i18) - (i17 / 2) : i47 - ((fVar.getWidth() - i49) / 2);
                    int i57 = fVar.f455213i;
                    int i58 = width + i57;
                    int width2 = (i48 + (i57 * 2)) - fVar.getWidth();
                    if (i58 > width2) {
                        i58 = width2;
                    }
                    fVar.f455216o = i58 >= 0 ? i58 : 0;
                    fVar.f455218q = true;
                    fVar.requestLayout();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
