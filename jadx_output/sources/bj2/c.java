package bj2;

/* loaded from: classes10.dex */
public final class c extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f21149b;

    /* renamed from: c, reason: collision with root package name */
    public final zh2.c f21150c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LivePreviewView f21151d;

    /* renamed from: e, reason: collision with root package name */
    public int f21152e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f21153f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f21154g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21155h;

    /* renamed from: i, reason: collision with root package name */
    public int f21156i;

    public c(android.content.Context context, zh2.c pluginAbility, com.tencent.mm.live.core.view.LivePreviewView previewView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(previewView, "previewView");
        this.f21149b = context;
        this.f21150c = pluginAbility;
        this.f21151d = previewView;
        this.f21152e = 1;
        this.f21153f = new java.util.HashMap();
        this.f21154g = new java.util.LinkedList();
    }

    @Override // hn5.c
    public int a() {
        return this.f21154g.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f21154g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (pm0.v.z(r9.f454521b.f454557i, 2) != false) goto L34;
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
        return ((xh2.a) this.f21154g.get(i17)).f454521b;
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
        kotlin.jvm.internal.o.g(data, "data");
        this.f21152e = i17;
        this.f21156i = this.f21156i;
        com.tencent.mars.xlog.Log.i("MicDecorLayoutAdapter", "updateData rightOffestSize: " + this.f21156i + " data: " + data);
        java.util.LinkedList linkedList = this.f21154g;
        linkedList.clear();
        linkedList.addAll(data);
        int size = linkedList.size();
        java.util.HashMap hashMap = this.f21153f;
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicDecorLayoutAdapter", "updateData clear cache");
            hashMap.clear();
        }
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((cj2.h) ((java.util.Map.Entry) it.next()).getValue()).setCorner(0);
        }
        f();
    }
}
