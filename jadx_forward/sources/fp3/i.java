package fp3;

/* loaded from: classes9.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d f346841d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d, fp3.a aVar) {
        this.f346841d = activityC16776x1b9c0a0d;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dp3.b getItem(int i17) {
        return (dp3.b) ((java.util.ArrayList) this.f346841d.f234361e).get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f346841d.f234361e).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f323734e;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fp3.j jVar;
        dp3.b item = getItem(i17);
        int i18 = item.f323734e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d = this.f346841d;
        if (i18 == 1) {
            android.view.View inflate = android.view.View.inflate(activityC16776x1b9c0a0d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bwa, null);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kkj);
            activityC16776x1b9c0a0d.f234377x = (android.widget.CheckedTextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kkm);
            activityC16776x1b9c0a0d.f234378y = (android.widget.CheckedTextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kki);
            activityC16776x1b9c0a0d.f234377x.setOnClickListener(activityC16776x1b9c0a0d.A);
            activityC16776x1b9c0a0d.f234378y.setOnClickListener(activityC16776x1b9c0a0d.A);
            int i19 = i17 + 1;
            if (i19 < getCount()) {
                activityC16776x1b9c0a0d.Y6(findViewById, getItem(i19));
            }
            return inflate;
        }
        if (i18 == 2) {
            android.view.View inflate2 = android.view.View.inflate(activityC16776x1b9c0a0d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bw_, null);
            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.kki);
            android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.kkj);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(item.f323731b, 0) >= 0) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.grc);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.p314xaae8f345.mm.R.raw.f80577xb5101f0f, 0);
            } else {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.grb);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.p314xaae8f345.mm.R.raw.f80573x586bcb73, 0);
            }
            int i27 = i17 + 1;
            if (i27 < getCount()) {
                activityC16776x1b9c0a0d.Y6(findViewById2, getItem(i27));
            }
            return inflate2;
        }
        if (view == null) {
            view = android.view.View.inflate(activityC16776x1b9c0a0d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bw9, null);
            jVar = new fp3.j(activityC16776x1b9c0a0d, null);
            jVar.f346842a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kko);
            jVar.f346843b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kkn);
            jVar.f346844c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kkl);
            jVar.f346845d = view.findViewById(com.p314xaae8f345.mm.R.id.kkj);
            view.setTag(jVar);
        } else {
            jVar = (fp3.j) view.getTag();
        }
        jVar.f346842a.setText(item.f323730a);
        if (android.text.TextUtils.isEmpty(item.f323731b)) {
            jVar.f346843b.setVisibility(4);
        } else {
            jVar.f346843b.setVisibility(0);
            jVar.f346843b.setText(item.f323731b);
        }
        if (item.f323733d) {
            jVar.f346844c.setVisibility(0);
        } else {
            jVar.f346844c.setVisibility(8);
        }
        int i28 = i17 + 1;
        if (i28 < getCount()) {
            activityC16776x1b9c0a0d.Y6(jVar.f346845d, getItem(i28));
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
