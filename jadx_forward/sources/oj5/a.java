package oj5;

/* loaded from: classes14.dex */
public final class a extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.b f427355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427356e;

    public a(oj5.b bVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f427355d = bVar;
        this.f427356e = c1163xf1deaba4;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
        oj5.b bVar = this.f427355d;
        bVar.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f427356e.mo7946xf939df19();
        if (mo7946xf939df19 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f427368a, mo7946xf939df19)) {
            return;
        }
        bVar.a(mo7946xf939df19);
        bVar.f427368a = mo7946xf939df19;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) {
            return super.contains((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) {
            return super.indexOf((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) {
            return super.lastIndexOf((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) {
            return super.remove((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj);
        }
        return false;
    }
}
