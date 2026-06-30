package lk5;

/* loaded from: classes13.dex */
public final class i extends p012xc85e97e9.p087x9da2e250.app.v0 implements p012xc85e97e9.p093xedfae76a.m1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f400569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37, android.os.Handler handler) {
        super(abstractActivityC22579xbed01a37 instanceof android.app.Activity ? abstractActivityC22579xbed01a37 : null, abstractActivityC22579xbed01a37, handler, 0);
        this.f400569h = abstractActivityC22579xbed01a37;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public android.view.View b(int i17) {
        return this.f400569h.m81200x2aac75d8().findViewById(i17);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.s0
    public boolean c() {
        android.view.Window window = this.f400569h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void d(java.lang.String prefix, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter writer, java.lang.String[] strArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(writer, "writer");
        this.f400569h.dump(prefix, fileDescriptor, writer, strArr);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public java.lang.Object e() {
        return this.f400569h;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public android.view.LayoutInflater f() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f400569h;
        android.view.LayoutInflater cloneInContext = abstractActivityC22579xbed01a37.getLayoutInflater().cloneInContext(abstractActivityC22579xbed01a37.m81200x2aac75d8());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cloneInContext, "cloneInContext(...)");
        return cloneInContext;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void g(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, java.lang.String[] permissions, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(permissions);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fragment, arrayList.toArray(), "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        fragment.m7547x637dca75((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(fragment, "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f400569h.getViewModel();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public boolean h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        return !this.f400569h.isFinishing();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public boolean i(java.lang.String permission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        return z2.h.b(this.f400569h, permission);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f400569h.mo7604xcc5c304b(fragment, intent, i17, bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f400569h.m7605x7fde412d(fragment, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.v0
    public void l() {
        this.f400569h.mo2548x55429c53();
    }
}
