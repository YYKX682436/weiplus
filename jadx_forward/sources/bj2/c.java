package bj2;

/* loaded from: classes10.dex */
public final class c extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f102682b;

    /* renamed from: c, reason: collision with root package name */
    public final zh2.c f102683c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 f102684d;

    /* renamed from: e, reason: collision with root package name */
    public int f102685e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f102686f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f102687g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f102688h;

    /* renamed from: i, reason: collision with root package name */
    public int f102689i;

    public c(android.content.Context context, zh2.c pluginAbility, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 previewView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewView, "previewView");
        this.f102682b = context;
        this.f102683c = pluginAbility;
        this.f102684d = previewView;
        this.f102685e = 1;
        this.f102686f = new java.util.HashMap();
        this.f102687g = new java.util.LinkedList();
    }

    @Override // hn5.c
    public int a() {
        return this.f102687g.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f102687g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (pm0.v.z(r9.f536054b.f536090i, 2) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        if (r4 != false) goto L34;
     */
    @Override // hn5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View c(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bj2.c.c(int, java.lang.Object):android.view.View");
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f102687g.get(i17)).f536054b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    @Override // hn5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r27, android.view.View r28) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bj2.c.g(int, android.view.View):void");
    }

    public final void h(int i17, java.util.LinkedList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f102685e = i17;
        this.f102689i = this.f102689i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicDecorLayoutAdapter", "updateData rightOffestSize: " + this.f102689i + " data: " + data);
        java.util.LinkedList linkedList = this.f102687g;
        linkedList.clear();
        linkedList.addAll(data);
        int size = linkedList.size();
        java.util.HashMap hashMap = this.f102686f;
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicDecorLayoutAdapter", "updateData clear cache");
            hashMap.clear();
        }
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((cj2.h) ((java.util.Map.Entry) it.next()).getValue()).m14947x78dc957(0);
        }
        f();
    }
}
