package bm2;

/* loaded from: classes3.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z1 f22443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.w1 f22445f;

    public y1(bm2.z1 z1Var, int i17, bm2.w1 w1Var) {
        this.f22443d = z1Var;
        this.f22444e = i17;
        this.f22445f = w1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$onBindViewHolder$1"
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
            bm2.z1 r7 = r6.f22443d
            int r0 = r6.f22444e
            if (r0 < 0) goto L36
            java.util.LinkedList r1 = r7.x()
            int r1 = r1.size()
            if (r0 >= r1) goto L39
            java.util.LinkedList r1 = r7.x()
            java.lang.Object r0 = r1.get(r0)
            r45.f70 r0 = (r45.f70) r0
            goto L3a
        L36:
            r7.getClass()
        L39:
            r0 = 0
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onItemClick pos:"
            r1.<init>(r2)
            int r2 = r7.f22476h
            r1.append(r2)
            java.lang.String r2 = ", new pos:"
            r1.append(r2)
            bm2.w1 r2 = r6.f22445f
            int r3 = r2.getAdapterPosition()
            r1.append(r3)
            java.lang.String r3 = ",componentValue:"
            r1.append(r3)
            if (r0 != 0) goto L5e
            java.lang.String r3 = ""
            goto L5f
        L5e:
            r3 = r0
        L5f:
            org.json.JSONObject r3 = pm0.b0.g(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r7.f22473e
            com.tencent.mars.xlog.Log.i(r3, r1)
            if (r0 == 0) goto L8e
            r1 = 0
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L8e
            int r1 = r2.getAdapterPosition()
            r7.f22476h = r1
            yz5.q r2 = r7.f22477i
            if (r2 == 0) goto L8b
            r45.ma0 r3 = r7.f22474f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.invoke(r3, r0, r1)
        L8b:
            r7.notifyDataSetChanged()
        L8e:
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCustomGiftEditAdapter$onBindViewHolder$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            yj0.a.h(r6, r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.y1.onClick(android.view.View):void");
    }
}
