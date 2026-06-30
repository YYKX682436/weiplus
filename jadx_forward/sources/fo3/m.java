package fo3;

/* loaded from: classes13.dex */
public class m implements android.view.View.OnTouchListener, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f346443d = {false};

    /* renamed from: e, reason: collision with root package name */
    public final boolean f346444e;

    /* renamed from: f, reason: collision with root package name */
    public final int f346445f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f346446g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f346447h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f346448i;

    public m(android.view.View view, java.lang.String str, java.lang.String str2) {
        this.f346444e = false;
        this.f346445f = -1;
        this.f346446g = "";
        this.f346447h = "";
        this.f346448i = true;
        if (str.equals("ce_open_lm")) {
            fo3.s.INSTANCE.gc();
        }
        this.f346448i = true;
        this.f346445f = -1;
        this.f346446g = str;
        this.f346447h = str2;
        if (view != null) {
            view.setOnTouchListener(this);
            this.f346444e = false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str = this.f346446g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SCH", "SCH onClick failed:" + th6);
        }
        if (!this.f346448i) {
            yj0.a.h(this, "com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = this.f346443d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            int i17 = this.f346445f;
            java.lang.String a17 = i17 > 0 ? fo3.l.a(i17) : "";
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb(str, this.f346447h, a17);
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535);
            if (this.f346444e) {
                sVar.mi(str, obtain, false);
            } else {
                sVar.H2(str, obtain);
            }
            sVar.Qa(str);
            obtain.recycle();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r0 != 6) goto L25;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r7
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r8 = 0
            boolean r0 = r7.f346448i     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L31
            java.lang.String r3 = "com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = 0
            r2 = r7
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            return r8
        L31:
            int r0 = r9.getAction()     // Catch: java.lang.Throwable -> L61
            fo3.s r1 = fo3.s.INSTANCE
            r2 = 1
            java.lang.String r3 = r7.f346446g
            if (r0 == 0) goto L4c
            if (r0 == r2) goto L45
            r4 = 5
            if (r0 == r4) goto L4c
            r2 = 6
            if (r0 == r2) goto L45
            goto L75
        L45:
            r1.H2(r3, r9)     // Catch: java.lang.Throwable -> L61
            r1.Qa(r3)     // Catch: java.lang.Throwable -> L61
            goto L75
        L4c:
            boolean[] r9 = r7.f346443d     // Catch: java.lang.Throwable -> L61
            r9[r8] = r2     // Catch: java.lang.Throwable -> L61
            int r9 = r7.f346445f     // Catch: java.lang.Throwable -> L61
            if (r9 <= 0) goto L59
            java.lang.String r9 = fo3.l.a(r9)     // Catch: java.lang.Throwable -> L61
            goto L5b
        L59:
            java.lang.String r9 = ""
        L5b:
            java.lang.String r0 = r7.f346447h     // Catch: java.lang.Throwable -> L61
            r1.qb(r3, r0, r9)     // Catch: java.lang.Throwable -> L61
            goto L75
        L61:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SCH onTouch failed: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "MicroMsg.SCH"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9)
        L75:
            java.lang.String r3 = "com/tencent/mm/plugin/normsg/api/NormsgSmartClickHelper"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = 0
            r2 = r7
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fo3.m.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
