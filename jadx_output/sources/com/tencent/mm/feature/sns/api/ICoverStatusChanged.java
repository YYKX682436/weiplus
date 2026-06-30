package com.tencent.mm.feature.sns.api;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "", "Ljz5/f0;", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "sns-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface ICoverStatusChanged {
    void onPostClose();

    void onPostOpen();

    void onPreClose();

    void onPreOpen();
}
