package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes5.dex */
public final class y2 {
    public y2(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (kotlin.jvm.internal.o.b(path, "FinderEntrance")) {
            if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "撤回发现页视频号右侧内容红点时是否删除整个红点", e42.c0.clicfg_finder_remove_ctrlinfo_when_dispose_finder_entrance, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.qh0.f127434d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126445c0).getValue()).r()).booleanValue()) {
                return true;
            }
        }
        if (kotlin.jvm.internal.o.b(path, "FinderMentionEntrance")) {
            if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "撤回发现页视频号左侧数字红点时是否删除整个红点", e42.c0.clicfg_finder_remove_ctrlinfo_when_dispose_finder_mention_entrance, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.sh0.f127551d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126447d0).getValue()).r()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
