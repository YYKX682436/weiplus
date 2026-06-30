package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public abstract class m1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f223120d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223121e;

    /* renamed from: f, reason: collision with root package name */
    public final android.database.DataSetObserver f223122f;

    public m1(android.content.Context context, android.database.Cursor cursor) {
        this.f223120d = cursor;
        this.f223121e = cursor != null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l1(this, null);
        this.f223122f = l1Var;
        android.database.Cursor cursor2 = this.f223120d;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(l1Var);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        android.database.Cursor cursor;
        if (!this.f223121e || (cursor = this.f223120d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (!this.f223121e) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f223120d.moveToPosition(i17)) {
            y(k3Var, this.f223120d);
        } else {
            throw new java.lang.IllegalStateException("couldn't move cursor to position " + i17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: setHasStableIds */
    public void mo8164xbbdced85(boolean z17) {
        super.mo8164xbbdced85(true);
    }

    public void x(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f223120d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            android.database.DataSetObserver dataSetObserver = this.f223122f;
            if (cursor2 != null && dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
            this.f223120d = cursor;
            if (cursor != null) {
                if (dataSetObserver != null) {
                    cursor.registerDataSetObserver(dataSetObserver);
                }
                this.f223121e = true;
                m8146xced61ae5();
            } else {
                this.f223121e = false;
                m8146xced61ae5();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void y(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.database.Cursor cursor);
}
