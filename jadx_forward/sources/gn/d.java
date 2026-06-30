package gn;

/* loaded from: classes14.dex */
public class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements com.p314xaae8f345.mm.p648x55baa833.ui.ie {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.TypedArray f355096d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f355097e;

    /* renamed from: f, reason: collision with root package name */
    public final gn.a f355098f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Calendar f355099g;

    /* renamed from: h, reason: collision with root package name */
    public final gn.b f355100h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Collection f355101i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f355102m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f355103n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f355104o;

    public d(android.content.Context context, gn.a aVar, android.content.res.TypedArray typedArray, long j17, java.util.Collection collection) {
        this.f355096d = typedArray;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f355099g = calendar;
        this.f355103n = java.lang.Integer.valueOf(typedArray.getInt(15, calendar.get(2) % 12));
        if (-1 != j17) {
            calendar.setTimeInMillis(j17);
        }
        this.f355102m = java.lang.Integer.valueOf(typedArray.getInt(13, calendar.get(2)));
        this.f355104o = typedArray.getBoolean(16, false);
        this.f355100h = new gn.b();
        this.f355101i = collection;
        this.f355097e = context;
        this.f355098f = aVar;
        if (typedArray.getBoolean(10, false)) {
            x(new kn.a(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        ((com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe) this.f355098f).getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.get(2);
        int i17 = calendar.get(1);
        calendar.get(5);
        int i18 = ((i17 - this.f355099g.get(1)) + 1) * 12;
        java.lang.Integer num = this.f355102m;
        if (num.intValue() != -1) {
            i18 -= num.intValue();
        }
        java.lang.Integer num2 = this.f355103n;
        return num2.intValue() != -1 ? i18 - ((12 - num2.intValue()) - 1) : i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        com.p314xaae8f345.mm.p648x55baa833.ui.le leVar = ((gn.c) k3Var).f355095d;
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        java.lang.Integer num = this.f355102m;
        int i37 = i17 % 12;
        int intValue = (num.intValue() + i37) % 12;
        java.util.Calendar calendar = this.f355099g;
        int intValue2 = (i17 / 12) + calendar.get(1) + ((num.intValue() + i37) / 12);
        gn.b bVar = this.f355100h;
        java.lang.Object obj = bVar.f355093d;
        int i38 = -1;
        if (obj != null) {
            kn.a aVar = (kn.a) obj;
            i19 = aVar.f390904b;
            i27 = aVar.f390905c;
            i18 = aVar.f390906d;
        } else {
            i18 = -1;
            i19 = -1;
            i27 = -1;
        }
        java.lang.Object obj2 = bVar.f355094e;
        if (obj2 != null) {
            kn.a aVar2 = (kn.a) obj2;
            int i39 = aVar2.f390904b;
            i29 = aVar2.f390905c;
            i38 = aVar2.f390906d;
            i28 = i39;
        } else {
            i28 = -1;
            i29 = -1;
        }
        leVar.P = 6;
        leVar.requestLayout();
        hashMap.put("selected_begin_year", java.lang.Integer.valueOf(i18));
        hashMap.put("selected_last_year", java.lang.Integer.valueOf(i38));
        hashMap.put("selected_begin_month", java.lang.Integer.valueOf(i27));
        hashMap.put("selected_last_month", java.lang.Integer.valueOf(i29));
        hashMap.put("selected_begin_day", java.lang.Integer.valueOf(i19));
        hashMap.put("selected_last_day", java.lang.Integer.valueOf(i28));
        hashMap.put("year", java.lang.Integer.valueOf(intValue2));
        hashMap.put("month", java.lang.Integer.valueOf(intValue));
        calendar.setFirstDayOfWeek(1);
        hashMap.put("week_start", java.lang.Integer.valueOf(calendar.getFirstDayOfWeek()));
        leVar.m43544x853bda9d(this.f355101i);
        leVar.m43545x947be264(hashMap);
        leVar.invalidate();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new gn.c(new com.p314xaae8f345.mm.p648x55baa833.ui.le(this.f355097e, this.f355096d), this);
    }

    public void x(kn.a aVar) {
        gn.a aVar2 = this.f355098f;
        ((com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe) aVar2).U6(aVar);
        boolean z17 = this.f355104o;
        gn.b bVar = this.f355100h;
        if (z17) {
            java.lang.Object obj = bVar.f355093d;
            if (obj != null && bVar.f355094e == null) {
                bVar.f355094e = aVar;
                if (((kn.a) obj).f390905c < aVar.f390905c) {
                    for (int i17 = 0; i17 < (((kn.a) bVar.f355093d).f390905c - aVar.f390905c) - 1; i17++) {
                        ((com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10368x68cc8efe) aVar2).U6(aVar);
                    }
                }
                aVar2.getClass();
            } else if (bVar.f355094e != null) {
                bVar.f355093d = aVar;
                bVar.f355094e = null;
            } else {
                bVar.f355093d = aVar;
            }
        } else {
            bVar.f355093d = aVar;
        }
        m8146xced61ae5();
    }
}
