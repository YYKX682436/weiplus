package yh2;

/* loaded from: classes3.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f543918d;

    /* renamed from: e, reason: collision with root package name */
    public final mm2.c1 f543919e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f543920f;

    /* renamed from: g, reason: collision with root package name */
    public final int f543921g;

    /* renamed from: h, reason: collision with root package name */
    public int f543922h;

    /* renamed from: i, reason: collision with root package name */
    public int f543923i;

    /* renamed from: m, reason: collision with root package name */
    public long f543924m;

    /* renamed from: n, reason: collision with root package name */
    public int f543925n;

    /* renamed from: o, reason: collision with root package name */
    public ce2.i f543926o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f543927p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f543928q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f543929r;

    /* renamed from: s, reason: collision with root package name */
    public int f543930s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f543931t;

    public h(android.content.res.Resources resources, mm2.c1 liveCommonSlice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resources, "resources");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCommonSlice, "liveCommonSlice");
        this.f543918d = resources;
        this.f543919e = liveCommonSlice;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch);
        this.f543921g = dimensionPixelOffset;
        this.f543922h = dimensionPixelOffset;
        this.f543923i = dimensionPixelOffset;
        this.f543927p = new java.util.ArrayList();
        this.f543928q = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f543927p.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((yh2.b) this.f543927p.get(i17)).f543901b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String string;
        yh2.a holder = (yh2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof yh2.e;
        java.util.ArrayList arrayList = this.f543927p;
        if (z17) {
            yh2.e eVar = (yh2.e) holder;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            yh2.b bVar = (yh2.b) obj;
            x(eVar, i17, bVar);
            eVar.f3639x46306858.setOnClickListener(new yh2.f(this, bVar));
            return;
        }
        boolean z18 = holder instanceof yh2.c;
        android.content.res.Resources resources = this.f543918d;
        if (z18) {
            yh2.c cVar = (yh2.c) holder;
            cVar.f3639x46306858.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4);
            android.widget.TextView textView = cVar.f543905d;
            textView.setTextColor(color);
            int i18 = ((yh2.b) arrayList.get(i17)).f543902c;
            ((yh2.b) arrayList.get(i17)).getClass();
            textView.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dti, java.lang.Integer.valueOf(i18 + 0)));
            return;
        }
        if (holder instanceof yh2.d) {
            yh2.d dVar = (yh2.d) holder;
            dVar.f543906d.setText(!this.f543920f ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsf, java.lang.Integer.valueOf(this.f543925n)) : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsp, java.lang.Integer.valueOf(this.f543925n)));
            zl2.r4 r4Var = zl2.r4.f555483a;
            boolean t17 = r4Var.t(this.f543919e.f410496d);
            android.widget.TextView textView2 = dVar.f543907e;
            if (t17) {
                if (this.f543926o != null) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = zl2.r4.S(r4Var, this.f543924m, 0, 2, null);
                    ce2.i iVar = this.f543926o;
                    objArr[1] = iVar != null ? iVar.f67809x225f1eb0 : null;
                    string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3a, objArr);
                } else {
                    string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lj8, this.f543931t ? "" : zl2.r4.S(r4Var, this.f543924m, 0, 2, null));
                }
                textView2.setText(string);
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "<get-tvHeat>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter", "bindHeader", "(Lcom/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$MemberHeaderViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter", "bindHeader", "(Lcom/tencent/mm/plugin/finder/live/mic/adapter/FinderLiveMicMemberLinearAdapter$MemberHeaderViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dem, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new yh2.d(this, inflate);
        }
        if (i17 == 3) {
            android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570459dev, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new yh2.c(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dew, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new yh2.e(inflate3);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0454 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(yh2.e r32, int r33, yh2.b r34) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yh2.h.x(yh2.e, int, yh2.b):void");
    }
}
