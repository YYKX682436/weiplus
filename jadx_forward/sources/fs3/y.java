package fs3;

/* loaded from: classes15.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f347864e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f347865f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f347866g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f347867h;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f347863d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f347868i = new java.util.HashMap();

    public y(android.content.Context context) {
        this.f347864e = context;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        this.f347865f = loadAnimation;
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        this.f347867h = loadAnimation2;
        android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
        this.f347866g = loadAnimation3;
        loadAnimation.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        loadAnimation3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        loadAnimation.setDuration(300L);
        loadAnimation2.setDuration(1000L);
        loadAnimation3.setDuration(1000L);
    }

    public void a(java.util.LinkedList linkedList) {
        this.f347863d = linkedList;
        if (linkedList != null && linkedList.size() > 0) {
            int size = this.f347863d.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.yo0 yo0Var = (r45.yo0) this.f347863d.get(i17);
                java.lang.String str = yo0Var == null ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472784d) ? yo0Var.f472785e : yo0Var.f472784d;
                java.util.HashMap hashMap = this.f347868i;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, java.lang.Boolean.FALSE);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f347863d;
        if (linkedList == null) {
            return 1;
        }
        return 1 + linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f347863d;
        if (linkedList != null && i17 < linkedList.size()) {
            return this.f347863d.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fs3.x xVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f347864e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aar, (android.view.ViewGroup) null);
            xVar = new fs3.x(this, view);
            view.setTag(xVar);
        } else {
            xVar = (fs3.x) view.getTag();
        }
        r45.yo0 yo0Var = (r45.yo0) getItem(i17);
        if (yo0Var != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472786f)) {
                xVar.f347862b.setText(yo0Var.f472784d);
            } else {
                xVar.f347862b.setText(yo0Var.f472786f);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472784d)) {
                android.widget.ImageView imageView = xVar.f347861a;
                java.lang.String str = yo0Var.f472785e;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = ds3.f.f324451a;
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                ds3.g gVar = (drawable == null || !(drawable instanceof ds3.g)) ? new ds3.g(str, null) : (ds3.g) drawable;
                gVar.b(str);
                imageView.setImageDrawable(gVar);
            } else {
                android.widget.ImageView imageView2 = xVar.f347861a;
                java.lang.String str2 = yo0Var.f472784d;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var2 = ds3.f.f324451a;
                android.graphics.drawable.Drawable drawable2 = imageView2.getDrawable();
                ds3.g gVar2 = (drawable2 == null || !(drawable2 instanceof ds3.g)) ? new ds3.g(str2, null) : (ds3.g) drawable2;
                gVar2.b(str2);
                imageView2.setImageDrawable(gVar2);
            }
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472784d) ? yo0Var.f472785e : yo0Var.f472784d;
            view.clearAnimation();
            java.util.HashMap hashMap = this.f347868i;
            if (hashMap.containsKey(str3) && !((java.lang.Boolean) hashMap.get(str3)).booleanValue()) {
                view.startAnimation(this.f347865f);
                hashMap.put(str3, java.lang.Boolean.TRUE);
            }
        }
        if (i17 + 1 == getCount()) {
            xVar.f347862b.setText("");
            xVar.f347861a.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562256bu3);
            fs3.v vVar = new fs3.v(this, view);
            android.view.animation.Animation animation = this.f347867h;
            animation.setAnimationListener(vVar);
            this.f347866g.setAnimationListener(new fs3.w(this, view));
            view.startAnimation(animation);
        }
        return view;
    }
}
