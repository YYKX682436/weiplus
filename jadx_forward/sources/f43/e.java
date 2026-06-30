package f43;

/* loaded from: classes13.dex */
public class e extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 f341074a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 c15867x7cd2cd13, f43.c cVar) {
        this.f341074a = c15867x7cd2cd13;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 c15867x7cd2cd13 = this.f341074a;
        f43.a aVar = c15867x7cd2cd13.f220653o;
        if (aVar == null) {
            return;
        }
        java.util.List list = ((f43.h) aVar).f341077d;
        int size = list != null ? list.size() : 0;
        if (size == 0) {
            if (c15867x7cd2cd13.f220652n == 0) {
                return;
            }
            c15867x7cd2cd13.removeAllViews();
            return;
        }
        if (c15867x7cd2cd13.f220652n != 0) {
            for (int i17 = 0; i17 < size; i17++) {
                if (c15867x7cd2cd13.f220652n > i17) {
                    android.view.View childAt = c15867x7cd2cd13.getChildAt(i17);
                    f43.b bVar = (f43.b) childAt.getTag();
                    if (bVar != null) {
                        c15867x7cd2cd13.f220653o.getClass();
                        if (bVar.f341071b == 0) {
                            c15867x7cd2cd13.f220653o.a(i17, childAt, c15867x7cd2cd13);
                        }
                    }
                    c15867x7cd2cd13.removeViewAt(i17);
                    c15867x7cd2cd13.addView(c15867x7cd2cd13.a(i17), i17);
                } else {
                    c15867x7cd2cd13.addView(c15867x7cd2cd13.a(i17));
                }
            }
            int i18 = c15867x7cd2cd13.f220652n - size;
            for (int i19 = 0; i19 < i18; i19++) {
                c15867x7cd2cd13.removeViewAt(size + i19);
            }
            return;
        }
        int i27 = 0;
        while (true) {
            java.util.List list2 = ((f43.h) c15867x7cd2cd13.f220653o).f341077d;
            if (i27 >= (list2 != null ? list2.size() : 0)) {
                return;
            }
            c15867x7cd2cd13.addView(c15867x7cd2cd13.a(i27));
            i27++;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
    }
}
