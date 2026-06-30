package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class l6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18636x2d4ee903 c18636x2d4ee903, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        super(0);
        this.f255582d = activityC18635xb8188ef9;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255582d;
        java.util.Iterator it = activityC18635xb8188ef9.Y.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((in5.c) next) instanceof lj4.f) {
                i17 = i18;
                break;
            }
            i18 = i19;
        }
        activityC18635xb8188ef9.Y.remove(i17);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC18635xb8188ef9.f255070e;
        if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8155x27702c4(i17);
        }
        return jz5.f0.f384359a;
    }
}
