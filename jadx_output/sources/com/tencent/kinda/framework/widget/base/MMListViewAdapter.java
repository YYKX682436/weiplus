package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class MMListViewAdapter extends android.widget.BaseAdapter {
    private static final java.lang.String TAG = "MicroMsg.MMListViewAdapter";
    private android.content.Context mContext;
    private com.tencent.kinda.gen.KListViewCallback mListViewCallback;

    public MMListViewAdapter(android.content.Context context, com.tencent.kinda.gen.KListViewCallback kListViewCallback) {
        this.mContext = context;
        this.mListViewCallback = kListViewCallback;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mListViewCallback.getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return this.mListViewCallback.getViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mars.xlog.Log.i(TAG, "getView %s %s", java.lang.Integer.valueOf(i17), view);
        com.tencent.kinda.framework.widget.base.MMKViewLayout mMKViewLayout = view != null ? (com.tencent.kinda.framework.widget.base.MMKViewLayout) view.getTag() : null;
        com.tencent.kinda.gen.KView fillData = this.mListViewCallback.fillData(i17, mMKViewLayout != null ? mMKViewLayout : null);
        com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) fillData;
        mMKView.getView().setTag(fillData);
        return mMKView.getView();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.mListViewCallback.getViewTypeCount();
    }
}
