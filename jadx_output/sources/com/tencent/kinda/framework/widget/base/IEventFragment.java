package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public interface IEventFragment {
    boolean addFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment);

    void fixOnResume(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment);

    boolean popFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment);

    boolean removeModal(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment);
}
