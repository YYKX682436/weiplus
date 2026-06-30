package com.tencent.mm.plugin.finder.live.aiassistant.tools;

@com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolSchema(description = "Open the lottery creation half-screen panel for the anchor and pre-fill UI with provided parameters. Only available when the anchor is broadcasting and the lottery feature is enabled.", name = "lottery::create", timeoutSeconds = 30, version = "1.0.0")
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0004\u0012\u0004\b\r\u0010\u0006R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0006R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0017\u0010\u0006R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\n\u0012\u0004\b\u0019\u0010\u0006R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0006R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u001d\u0010\u0006R\"\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0006¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/aiassistant/tools/LotteryCreateParams;", "Lyd2/l;", "", "prizeType", "I", "getPrizeType$annotations", "()V", "winnerCount", "getWinnerCount$annotations", "durationMinutes", "Ljava/lang/Integer;", "getDurationMinutes$annotations", "attendType", "getAttendType$annotations", "", "attendComment", "Ljava/lang/String;", "getAttendComment$annotations", "", "allowRepeatWin", "Z", "getAllowRepeatWin$annotations", "lotteryDescription", "getLotteryDescription$annotations", "claimType", "getClaimType$annotations", "claimRemindWording", "getClaimRemindWording$annotations", "giftDistributeType", "getGiftDistributeType$annotations", "", "giftItems", "Ljava/util/List;", "getGiftItems$annotations", "<init>", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LotteryCreateParams extends yd2.l {
    public boolean allowRepeatWin;
    public java.lang.String attendComment;
    public java.lang.String claimRemindWording;
    public java.lang.Integer claimType;
    public java.lang.Integer durationMinutes;
    public java.lang.Integer giftDistributeType;
    public java.util.List<?> giftItems;
    public java.lang.String lotteryDescription;
    public int prizeType;
    public int winnerCount = 1;
    public int attendType = 1;

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(defaultValue = "false", description = "是否允许同一用户重复中奖，默认 false")
    public static /* synthetic */ void getAllowRepeatWin$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "特定评论内容，仅 attendType=3 时必填，长度 ≥1")
    public static /* synthetic */ void getAttendComment$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "用户参与方式: 1=Comment（任意评论）, 2=Like, 3=SpecificComment（需填 attendComment）, 4=Follow, 5=FanClub。不支持 6=ReserveLive", enumValues = {1, 2, 3, 4, 5}, required = true)
    public static /* synthetic */ void getAttendType$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "自定义兑奖话术，仅 claimType=2 时必填，长度 ≥1")
    public static /* synthetic */ void getClaimRemindWording$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "兑奖方式（仅 prizeType=0 可传）: 0=PersonalMsg 私信（默认）, 1=LocationE 地址, 2=Customize 自定义提示。prizeType=2 时客户端强制为 PackageGift，不要传", enumValues = {0, 1, 2})
    public static /* synthetic */ void getClaimType$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "开奖倒计时（分钟）。不传走系统默认；上限由后端动态下发，通常为 15", min = 1)
    public static /* synthetic */ void getDurationMinutes$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "礼物分配方式（prizeType=2 时必填）: 0=Same 每人一份相同礼物组合, 1=Random 随机分配", enumValues = {0, 1})
    public static /* synthetic */ void getGiftDistributeType$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "礼物清单（prizeType=2 时必填）。数组，每项为一个对象：{\"product_id\": 主播礼物池中的礼物 id (string), \"count\": 份数 (integer, ≥1)}")
    public static /* synthetic */ void getGiftItems$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "奖品描述，prizeType=0（Custom）时必填")
    public static /* synthetic */ void getLotteryDescription$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "抽奖类型: 0=Custom 自定义抽奖, 2=PackageGift 背包礼物", enumValues = {0, 2}, required = true)
    public static /* synthetic */ void getPrizeType$annotations() {
    }

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(description = "中奖人数, ≥1。PackageGift + Random 分配时额外要求 ≤ 礼物总份数", min = 1, required = true)
    public static /* synthetic */ void getWinnerCount$annotations() {
    }
}
