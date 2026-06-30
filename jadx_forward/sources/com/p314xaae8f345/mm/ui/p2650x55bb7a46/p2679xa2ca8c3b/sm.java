package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public class sm {
    public sm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar) {
        android.content.Context context = xgVar.getContext();
        android.widget.TextView textView = new android.widget.TextView(context, null, com.p314xaae8f345.mm.R.C30868x68b1db1.f575653er);
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562762nv);
        textView.setId(com.p314xaae8f345.mm.R.id.bqw);
        textView.setVisibility(8);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        if (h17 != dimensionPixelSize) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemStackMsgContainerHandler", "warn!!! cacheSize:%s sysSize:%s", java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(dimensionPixelSize));
        }
        textView.setTextSize(0, dimensionPixelSize);
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        layoutParams.addRule(4, com.p314xaae8f345.mm.R.id.f565229br1);
        layoutParams.addRule(19, com.p314xaae8f345.mm.R.id.f565229br1);
        layoutParams.addRule(21, -1);
        layoutParams.setMargins(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf), 0);
        xgVar.addView(textView, layoutParams);
    }
}
