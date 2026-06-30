package ed5;

/* loaded from: classes9.dex */
public final class u implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f332924d;

    /* renamed from: e, reason: collision with root package name */
    public float f332925e;

    /* renamed from: f, reason: collision with root package name */
    public float f332926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ed5.v f332927g;

    public u(ed5.v vVar) {
        this.f332927g = vVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTradeCountDecoration$TradeCountTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTradeCountDecoration$TradeCountTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        ed5.v vVar = this.f332927g;
        if (actionMasked == 0) {
            boolean contains = vVar.f332931g.contains(e17.getX(), e17.getY());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_DOWN x=%.1f y=%.1f bounds=%s inBounds=%s", java.lang.Float.valueOf(e17.getX()), java.lang.Float.valueOf(e17.getY()), vVar.f332931g, java.lang.Boolean.valueOf(contains));
            if (contains) {
                this.f332924d = true;
                this.f332925e = e17.getX();
                this.f332926f = e17.getY();
            } else {
                this.f332924d = false;
            }
        } else if (actionMasked == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_UP x=%.1f y=%.1f isPressed=%s", java.lang.Float.valueOf(e17.getX()), java.lang.Float.valueOf(e17.getY()), java.lang.Boolean.valueOf(this.f332924d));
            if (this.f332924d) {
                float x17 = e17.getX() - this.f332925e;
                float y17 = e17.getY() - this.f332926f;
                float f17 = (x17 * x17) + (y17 * y17);
                int scaledTouchSlop = android.view.ViewConfiguration.get(rv6.getContext()).getScaledTouchSlop();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Float.valueOf(f17);
                float f18 = scaledTouchSlop * scaledTouchSlop;
                objArr[1] = java.lang.Float.valueOf(f18);
                objArr[2] = java.lang.Boolean.valueOf(f17 <= f18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_UP dist2=%.1f slop2=%.1f pass=%s", objArr);
                if (f17 <= f18) {
                    vVar.getClass();
                    android.content.Context context = rv6.getContext();
                    java.lang.String str = vVar.f332929e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] talker=%s context=%s", str, context);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6 c5331xbad3b2c6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6();
                    am.x4 x4Var = c5331xbad3b2c6.f135644g;
                    x4Var.f89877a = str;
                    x4Var.f89878b = new java.lang.ref.WeakReference(rv6.getContext());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] publishing EntryWalletLedgerEvent");
                    c5331xbad3b2c6.e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] event published, reporting kvStat");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 0, 1, 0, 0);
                }
            }
            this.f332924d = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_CANCEL");
                this.f332924d = false;
            }
        } else if (this.f332924d) {
            float x18 = e17.getX() - this.f332925e;
            float y18 = e17.getY() - this.f332926f;
            int scaledTouchSlop2 = android.view.ViewConfiguration.get(rv6.getContext()).getScaledTouchSlop();
            if ((x18 * x18) + (y18 * y18) > scaledTouchSlop2 * scaledTouchSlop2) {
                this.f332924d = false;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
        if (z17) {
            this.f332924d = false;
        }
    }
}
