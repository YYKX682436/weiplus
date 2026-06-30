package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.DialPad */
/* loaded from: classes14.dex */
public class ViewOnClickListenerC16124xc5ddcee3 extends android.widget.RelativeLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f224054i = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f224055m = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", ""};

    /* renamed from: d, reason: collision with root package name */
    public boolean f224056d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f224057e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f224058f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f224059g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b f224060h;

    public ViewOnClickListenerC16124xc5ddcee3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f224056d = false;
        this.f224057e = new java.util.HashMap();
        this.f224058f = new java.util.HashMap();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f224059g = hashMap;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570241a46, this);
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562069a30);
        float dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562071a32);
        float dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562070a31);
        java.lang.String[] strArr = f224054i;
        java.lang.String str = strArr[0];
        java.lang.String[] strArr2 = f224055m;
        a(com.p314xaae8f345.mm.R.id.cyl, str, strArr2[0], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyr, strArr[1], strArr2[1], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyq, strArr[2], strArr2[2], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyj, strArr[3], strArr2[3], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyi, strArr[4], strArr2[4], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyo, strArr[5], strArr2[5], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cym, strArr[6], strArr2[6], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyh, strArr[7], strArr2[7], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyk, strArr[8], strArr2[8], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyp, strArr[9], strArr2[9], dimensionPixelSize3);
        a(com.p314xaae8f345.mm.R.id.cys, strArr[10], strArr2[10], dimensionPixelSize);
        a(com.p314xaae8f345.mm.R.id.cyn, strArr[11], strArr2[11], dimensionPixelSize2);
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d1q), findViewById(com.p314xaae8f345.mm.R.id.d1q));
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d1w), findViewById(com.p314xaae8f345.mm.R.id.d1w));
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d1u), findViewById(com.p314xaae8f345.mm.R.id.d1u));
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d1k), findViewById(com.p314xaae8f345.mm.R.id.d1k));
        hashMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.d1j), findViewById(com.p314xaae8f345.mm.R.id.d1j));
        for (android.view.View view : hashMap.values()) {
            if (this.f224056d) {
                view.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.a8h));
            } else {
                view.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560420jx));
            }
        }
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b c16123x25cf8f8b = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b) findViewById(i17);
        c16123x25cf8f8b.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.length() == 1) {
            c16123x25cf8f8b.f224052d.setText(str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || "1".equals(str)) {
            c16123x25cf8f8b.f224053e.setText(str2);
            c16123x25cf8f8b.f224053e.setVisibility(0);
        } else {
            c16123x25cf8f8b.f224053e.setVisibility(8);
        }
        c16123x25cf8f8b.f224052d.setTextSize(0, f17);
        c16123x25cf8f8b.setOnClickListener(this);
        c16123x25cf8f8b.setOnLongClickListener(this);
        c16123x25cf8f8b.m65169x93d35e8a(this.f224056d);
        this.f224057e.put(java.lang.Integer.valueOf(i17), c16123x25cf8f8b);
        this.f224058f.put(str, c16123x25cf8f8b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.util.Map r0 = r6.f224057e
            int r1 = r7.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Ld0
            java.util.Map r0 = r6.f224057e
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r7 = r0.get(r7)
            com.tencent.mm.plugin.ipcall.ui.DialNumberButton r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b) r7
            java.lang.String r0 = r7.m65167xd6e0800c()
            java.lang.String r7 = r7.m65168x8b71a1a7()
            com.tencent.mm.plugin.ipcall.model.r r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi()
            wq4.c r1 = r1.f224047r
            if (r1 != 0) goto L5c
            com.tencent.mm.plugin.ipcall.model.r r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi()
            wq4.c r2 = new wq4.c
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r2.<init>(r3)
            r1.f224047r = r2
        L5c:
            com.tencent.mm.plugin.ipcall.model.r r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi()
            wq4.c r1 = r1.f224047r
            r1.getClass()
            r2 = -1
            if (r0 == 0) goto L84
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L71
            goto L84
        L71:
            java.util.HashMap r3 = wq4.c.f530149c
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L84
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L85
        L84:
            r3 = r2
        L85:
            if (r3 != r2) goto L88
            goto Lc1
        L88:
            android.content.Context r2 = wq4.c.f530150d
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "dtmf_tone"
            r5 = 1
            int r2 = android.provider.Settings.System.getInt(r2, r4, r5)
            if (r2 != r5) goto L99
            r2 = r5
            goto L9a
        L99:
            r2 = 0
        L9a:
            if (r2 != 0) goto L9d
            goto Lc1
        L9d:
            xm1.h r2 = ym1.f.wi()
            android.media.AudioManager r2 = r2.c()
            int r2 = r2.getRingerMode()
            if (r2 == 0) goto Lc1
            if (r2 != r5) goto Lae
            goto Lc1
        Lae:
            java.lang.Object r2 = r1.f530151a
            monitor-enter(r2)
            android.media.ToneGenerator r1 = r1.f530152b     // Catch: java.lang.Throwable -> Lbe
            if (r1 != 0) goto Lb7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc1
        Lb7:
            r4 = 250(0xfa, float:3.5E-43)
            r1.startTone(r3, r4)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc1
        Lbe:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            throw r7
        Lc1:
            com.tencent.mm.plugin.ipcall.ui.b r1 = r6.f224060h
            if (r1 == 0) goto Ld0
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r2 != 0) goto Lcc
            goto Lcd
        Lcc:
            r0 = r7
        Lcd:
            r1.a(r0)
        Ld0:
            java.lang.String r7 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            yj0.a.h(r6, r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3.onClick(android.view.View):void");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.util.Map map = this.f224057e;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(view.getId()))) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b c16123x25cf8f8b = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.getId()));
        java.lang.String m65167xd6e0800c = c16123x25cf8f8b.m65167xd6e0800c();
        java.lang.String m65168x8b71a1a7 = c16123x25cf8f8b.m65168x8b71a1a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b bVar = this.f224060h;
        if (bVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m65167xd6e0800c)) {
                m65167xd6e0800c = m65168x8b71a1a7;
            }
            bVar.b(m65167xd6e0800c);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DialPad", "onViewAdded, class: %s", view.getClass().getSimpleName());
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DialPad", "onViewRemoved, class: %s", view.getClass().getSimpleName());
    }

    /* renamed from: setDialButtonClickListener */
    public void m65171xb1e1a3f8(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b bVar) {
        this.f224060h = bVar;
    }

    /* renamed from: setTalkUIMode */
    public void m65172x80095805(boolean z17) {
        this.f224056d = z17;
        java.util.Iterator it = ((java.util.HashMap) this.f224057e).values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16123x25cf8f8b) it.next()).m65169x93d35e8a(z17);
        }
        for (android.view.View view : ((java.util.HashMap) this.f224059g).values()) {
            if (this.f224056d) {
                view.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.a8h));
            } else {
                view.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560420jx));
            }
        }
    }
}
