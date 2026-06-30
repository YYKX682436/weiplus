package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes9.dex */
public class il extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.Cursor f242696d;

    /* renamed from: e, reason: collision with root package name */
    public final int f242697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f242698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.RunnableC17457x5e8caa59 f242699g;

    public il(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.RunnableC17457x5e8caa59 runnableC17457x5e8caa59, android.database.Cursor cursor) {
        this.f242699g = runnableC17457x5e8caa59;
        this.f242697e = 0;
        this.f242698f = 0;
        this.f242696d = cursor;
        this.f242697e = cursor.getCount() + 1;
        this.f242698f = runnableC17457x5e8caa59.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        android.database.Cursor cursor = this.f242696d;
        return (cursor.isClosed() || !cursor.moveToPosition(i17 + (-1))) ? "" : cursor.getString(cursor.getColumnIndex(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f242697e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) this.f242699g.f242161f.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjq, (android.view.ViewGroup) null);
        if (i17 == 0) {
            checkedTextView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            checkedTextView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iui);
        } else if (i17 == this.f242697e - 1) {
            checkedTextView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            checkedTextView.setText(getItem(i17));
        } else {
            checkedTextView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            checkedTextView.setText(getItem(i17));
        }
        int i18 = this.f242698f;
        checkedTextView.setPadding(i18, 0, i18, 0);
        checkedTextView.setCheckMarkDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axu);
        return checkedTextView;
    }
}
