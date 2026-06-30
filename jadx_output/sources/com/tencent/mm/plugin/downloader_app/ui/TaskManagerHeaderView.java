package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes.dex */
public class TaskManagerHeaderView extends android.widget.LinearLayout {
    public TaskManagerHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        ((android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bjc, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.m4j)).setOnClickListener(new r02.c1(this));
        android.view.View view = new android.view.View(getContext());
        view.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478897k6));
        addView(view, -1, 1);
    }
}
