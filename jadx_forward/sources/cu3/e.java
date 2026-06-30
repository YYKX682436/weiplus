package cu3;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd f304005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd) {
        super(1);
        this.f304005d = c17002x1531c3fd;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd c17002x1531c3fd = this.f304005d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17002x1531c3fd.getTAG(), "onSelect " + intValue);
        if (intValue == 0) {
            c17002x1531c3fd.getSeekBarLayout().setVisibility(4);
        } else {
            c17002x1531c3fd.getSeekBarLayout().setVisibility(0);
        }
        java.lang.Float valueOf = c17002x1531c3fd.m67931x4f34a90e().containsKey(java.lang.Integer.valueOf(intValue)) ? c17002x1531c3fd.m67931x4f34a90e().get(java.lang.Integer.valueOf(intValue)) : java.lang.Float.valueOf(c17002x1531c3fd.getDefaultWeight());
        android.widget.SeekBar seekBar = c17002x1531c3fd.getSeekBar();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        seekBar.setProgress((int) (valueOf.floatValue() * 100));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1993xb408cb78.C17002x1531c3fd.a(c17002x1531c3fd, intValue, valueOf.floatValue());
        for (cu3.d dVar : c17002x1531c3fd.m67925x7f4a1465()) {
            if (dVar.f304000b != intValue) {
                android.view.View view = dVar.f304003e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f384359a;
    }
}
