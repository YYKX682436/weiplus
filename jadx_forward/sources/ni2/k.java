package ni2;

/* loaded from: classes3.dex */
public final class k extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f418879d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.q f418880e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f418881f;

    /* renamed from: g, reason: collision with root package name */
    public final ni2.v2 f418882g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, km2.q qVar, java.util.List pkTeamMembers, ni2.v2 panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkTeamMembers, "pkTeamMembers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.f418879d = basePlugin;
        this.f418880e = qVar;
        this.f418881f = pkTeamMembers;
        this.f418882g = panel;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        container.removeView((android.view.View) object);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.List list = this.f418881f;
        if (!list.isEmpty()) {
            return list.size();
        }
        return 1;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        java.util.List list = this.f418881f;
        if (!list.isEmpty()) {
            return ((km2.q) list.get(i17)).f390706d;
        }
        km2.q qVar = this.f418880e;
        if (qVar != null) {
            return qVar.f390706d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ff  */
    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup r32, int r33) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.k.mo7744x8d1aed1d(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, object);
    }
}
