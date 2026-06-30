package ki2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f389640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ki2.e f389641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, ki2.e eVar) {
        super(0);
        this.f389640d = c14245x86828950;
        this.f389641e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f389640d;
        gi2.d f193233w = c14245x86828950.getF193233w();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        ki2.e eVar = this.f389641e;
        if (f193233w != null) {
            java.util.LinkedList linkedList = ((gi2.e) f193233w).f353806g;
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            eVar.getClass();
            java.lang.String str = "checkAddContentView diff tag, removeAll, tag: " + c14245x86828950.getTag() + " childCount: " + c14245x86828950.getChildCount();
            java.lang.String str2 = eVar.f353799a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14245x86828950.getTag(), str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14245x86828950.getSingContentLayout().getParent(), c14245x86828950)) {
                i17 = 0;
            } else {
                c14245x86828950.removeAllViews();
                c14245x86828950.addView(c14245x86828950.getCoverBackgroundLayout(), new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
                android.widget.FrameLayout singContentLayout = c14245x86828950.getSingContentLayout();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, i65.a.b(c14245x86828950.getContext(), 260));
                layoutParams.f92426h = 0;
                layoutParams.f92418d = 0;
                int b17 = i65.a.b(c14245x86828950.getContext(), 129);
                gi2.d f193233w2 = c14245x86828950.getF193233w();
                layoutParams.setMargins(0, b17 + (f193233w2 != null ? f193233w2.f353801b : 0), 0, 0);
                c14245x86828950.addView(singContentLayout, layoutParams);
                android.widget.RelativeLayout contentScrollWrapperLayout = c14245x86828950.getContentScrollWrapperLayout();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
                layoutParams2.f92428i = c14245x86828950.getSingContentLayout().getId();
                layoutParams2.f92418d = 0;
                layoutParams2.f92424g = 0;
                layoutParams2.setMargins(0, 0, 0, 0);
                c14245x86828950.addView(contentScrollWrapperLayout, layoutParams2);
                int id6 = c14245x86828950.getContentScrollWrapperLayout().getId();
                int b18 = i65.a.b(c14245x86828950.getContext(), 1);
                android.view.View bottomLinkSpace = c14245x86828950.getBottomLinkSpace();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, i65.a.b(c14245x86828950.getContext(), 1));
                layoutParams3.f92428i = id6;
                i17 = 0;
                layoutParams3.f92418d = 0;
                layoutParams3.setMargins(0, b18, 0, 0);
                c14245x86828950.addView(bottomLinkSpace, layoutParams3);
            }
            for (int i18 = i17; i18 < size; i18++) {
                java.lang.Object obj = linkedList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                xh2.a aVar = (xh2.a) obj;
                arrayList.add(f193233w.a(i18));
                arrayList2.add(aVar.f536054b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "addView index:" + i18 + " layoutInfo:" + aVar);
            }
            c14245x86828950.getContentLayout().removeAllViews();
            if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            } else {
                eVar.c(arrayList);
                eVar.b(arrayList, f193233w, c14245x86828950);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(eVar.f353799a, "notifyUpdate layoutAdapter = null");
        }
        return f0Var2;
    }
}
