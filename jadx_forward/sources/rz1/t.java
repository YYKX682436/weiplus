package rz1;

/* loaded from: classes2.dex */
public class t extends android.widget.ArrayAdapter {
    public t(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI, android.content.Context context, int i17, int i18, java.util.List list) {
        super(context, i17, i18, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view2);
        if (i17 % 10 == 0) {
            viewGroup.setOnTouchListener(new rz1.s(this));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view2, "view_id_" + i17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, ((java.util.ArrayList) com.tencent.mm.plugin.datareport.sample.ScrollSampleUI.g).get(i17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view2, 40, 24184);
        }
        return view2;
    }
}
