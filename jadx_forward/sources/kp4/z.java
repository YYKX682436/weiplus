package kp4;

/* loaded from: classes5.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f392694d;

    /* renamed from: e, reason: collision with root package name */
    public final kp4.n0 f392695e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f392696f;

    /* renamed from: g, reason: collision with root package name */
    public int f392697g;

    public z(java.util.List segmentClipDataList, kp4.n0 onItemSelectedListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentClipDataList, "segmentClipDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemSelectedListener, "onItemSelectedListener");
        this.f392694d = segmentClipDataList;
        this.f392695e = onItemSelectedListener;
        this.f392696f = "MicroMsg.MediaThumb.Adapter";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f392694d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String r17;
        kp4.b0 holder = (kp4.b0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = i17 == this.f392697g;
        bg0.y segmentClipData = (bg0.y) this.f392694d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentClipData, "segmentClipData");
        holder.m8183xf806b362();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = segmentClipData.f101402e;
        if (abstractC15633xee433078 != null) {
            e60.n1 n1Var = (e60.n1) i95.n0.c(e60.n1.class);
            android.widget.ImageView imageView = holder.f392623g;
            int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
            java.lang.String o17 = abstractC15633xee433078.o();
            java.lang.String str = abstractC15633xee433078.f219963e;
            long j17 = abstractC15633xee433078.f219967i;
            kp4.a0 a0Var = new kp4.a0(holder);
            num = 0;
            long j18 = abstractC15633xee433078.f219968m;
            ((d60.i0) n1Var).getClass();
            e33.m6.b(imageView, mo63659xfb85f7b0, o17, str, j17, -1, a0Var, j18);
        } else {
            num = 0;
        }
        float f17 = holder.f392627n;
        android.view.View view = holder.f392624h;
        if (view != null) {
            view.setOutlineProvider(new zl5.a(false, true, f17));
        }
        if (view != null) {
            view.setClipToOutline(true);
        }
        boolean z18 = abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b;
        android.view.View view2 = holder.f392620d;
        if (z18) {
            android.view.View view3 = holder.f392624h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            java.lang.Integer num3 = num;
            arrayList.add(num3);
            java.util.Collections.reverse(arrayList);
            num2 = num3;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r17 = i65.a.r(view2.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571957ul);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        } else {
            num2 = num;
            android.view.View view4 = holder.f392624h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r17 = i65.a.r(view2.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571944u8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        }
        view2.setContentDescription(r17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f17, f17, f17, f17, f17, f17});
        int i18 = holder.f392625i;
        if (i18 > 0) {
            gradientDrawable.setStroke(i18, holder.f392626m);
        }
        holder.f392622f.setBackground(gradientDrawable);
        if (z17) {
            android.view.View view5 = holder.f392622f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(num2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view6 = holder.f392622f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjc, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        kp4.b0 b0Var = new kp4.b0(inflate);
        inflate.setOnClickListener(new kp4.y(this, b0Var));
        return b0Var;
    }
}
